package edu.galileo.android.tipcalc.fragments;

import edu.galileo.android.tipcalc.model.TipRecord;

/**
 * Created by drsolomon on 24/03/17
 */
public interface TipHistoryListFragmentListener {
    void addToList(TipRecord record);
    void clearList();
}
