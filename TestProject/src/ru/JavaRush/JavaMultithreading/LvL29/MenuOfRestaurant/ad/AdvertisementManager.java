package ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.ad;

/*
у каждого планшета будет свой объект менеджера, который будет подбирать оптимальный набор
роликов и их последовательность для каждого заказа.
Он также будет взаимодействовать с плеером и отображать ролики.
*/

import ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.ConsoleHelper;

import java.util.*;

public class AdvertisementManager {
    private final AdvertisementStorage storage;
    private int timeSeconds;        // Общее время показа

    private long amount;

    public AdvertisementManager(int timeSeconds) {
        storage = AdvertisementStorage.getInstance();
        this.timeSeconds = timeSeconds;
    }

    public void processVideos() {
        if (storage.list().isEmpty()) {
            throw new NoVideoAvailableException();
        }
        List<Advertisement> resultList = storage.list();

        List<Advertisement> videoToBeShown = new ArrayList<>();
        videoToBeShown = getVideos(videoToBeShown, 0);


        Collections.sort(resultList, new Comparator<Advertisement>() {
            @Override
            public int compare(Advertisement o1, Advertisement o2) {
                return (int) (o2.getAmountPerOneDisplaying() - o1.getAmountPerOneDisplaying());
            }
        }.thenComparing(new Comparator<Advertisement>() {
            @Override
            public int compare(Advertisement o1, Advertisement o2) {
                return (int) (o1.getAmountPerOneDisplaying() * 1000 / o1.getDuration() - o2.getAmountPerOneDisplaying() * 1000 / o2.getDuration());
            }
        }));

        for (int i = 0; i < resultList.size(); i++) {
            ConsoleHelper.writeMessage(resultList.get(i).toString());
            resultList.get(i).revalidate();
        }
    }

    private long calcSumAmount(List<Advertisement> resultList) {
        long calcSumAmount = 0;
        for (Advertisement advertisement : resultList) {
            calcSumAmount += advertisement.getAmountPerOneDisplaying();
        }
        return calcSumAmount;
    }

    private int calcSumDuration(List<Advertisement> resultList) {
        int calcSumDuration = 0;
        for (Advertisement advertisement : resultList) {
            calcSumDuration += advertisement.getDuration();
        }
        return calcSumDuration;
    }

    private List<Advertisement> checkVideos(List<Advertisement> checkList, List<Advertisement> tempList) {
        List<Advertisement> result = new ArrayList<>();
        if (calcSumAmount(checkList) > calcSumAmount(checkList)) {
            result = checkList;
        } else if (calcSumAmount(checkList) < calcSumAmount(checkList)) {
            result = tempList;
        } else if (calcSumAmount(checkList) == calcSumAmount(checkList)) {
            if (calcSumDuration(checkList) > calcSumDuration(tempList)) {
                result = checkList;
            } else if (calcSumDuration(checkList) < calcSumDuration(tempList)) {
                result = tempList;
            } else if (calcSumDuration(checkList) == calcSumDuration(tempList)) {
                if (checkList.size() > tempList.size()) {
                    result = checkList;
                } else {
                    result = tempList;
                }
            }
        }
        return result;
    }

    public List<Advertisement> getVideos(List<Advertisement> inList, int start) {
        List<Advertisement> storageList = storage.list();
        List<Advertisement> tmp;
        List<Advertisement> result = new ArrayList<>();

        int timeLeft = timeSeconds - calcSumDuration(inList);

        Advertisement ad;

        for (int i = start; i < storageList.size(); i++) { // проходим по сторейдж массиву
            ad = storageList.get(i);
            if (!inList.contains(ad) && ad.getHits() > 0 && (ad.getDuration() <= timeLeft)) {
                inList.add(ad);
                result = checkVideos(inList, getVideos(inList, i));

            }
        }
        return result;
    }
}

/*
amountPerOneDisplaying = hits > 0 ? initialAmount / hits : 0;

 private List<Advertisement> listVideo (int timeSeconds, int startIndex) {
        for (int i = startIndex; i < storage.list().size(); i++) {

            if (startIndex == storage.list().size() - 1) {
                return new ArrayList<>();
            } else if (storage.list().get(i).getDuration() > timeSeconds) {
                continue;
            } else if (storage.list().get(i).getDuration() == timeSeconds) {
                List <Advertisement> resultList = new ArrayList<>();
                resultList.add(storage.list().get(i));
                return resultList;
            }

            List<Advertisement> resultList = listVideo(timeSeconds - storage.list().get(i).getDuration(), i+1);

            if (resultList.isEmpty()){
                resultList.add(storage.list().get(i));
                return resultList;
            }
        }
        return new ArrayList<>();
    }


private int sumTime(AdvertisementStorage storage) {
        int sumTime = 0;
        for (Advertisement advertisement : storage.list()) {
            sumTime += advertisement.getDuration();
        }
        return sumTime;
    }

    private long sumAmount(AdvertisementStorage storage) {
        long sumAmount = 0;
        for (Advertisement advertisement : storage.list()) {
            sumAmount += advertisement.getAmountPerOneDisplaying();
        }
        return sumAmount;
    }

    private void checkMethod(AdvertisementStorage storage) {
        if (resultList == null) {
            if (sumTime(storage) <= timeSeconds) {
                resultList = storage.list();
                amount = sumAmount(storage);
            }
        } else {
            if (sumTime(storage) <= timeSeconds && sumAmount(storage) > amount) {
                resultList = storage.list();
                amount = sumAmount(storage);
            }
        }
    }

    private void MakeAllVideos(List<Advertisement> storage) {
        if (storage.size() > 0) {
            checkMethod(storage);
        }

        for (int i = 0; i < storage.size(); i++) {
            List<Advertisement> newVideo = new ArrayList<>(storage);
            newVideo.remove(i);
            MakeAllVideos(newVideo);
        }
    }

 */
