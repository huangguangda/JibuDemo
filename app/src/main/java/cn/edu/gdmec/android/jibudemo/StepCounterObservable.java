package cn.edu.gdmec.android.jibudemo;

import java.util.Observable;

/**
 * Created by Jack on 2018/3/9.
 */

public class StepCounterObservable extends Observable {

    public void sendChange(float progress) {
        setChanged();
        notifyObservers(progress);
    }
}