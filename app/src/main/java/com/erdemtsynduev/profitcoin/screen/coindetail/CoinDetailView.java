package com.erdemtsynduev.profitcoin.screen.coindetail;

import android.os.Bundle;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;
import com.erdemtsynduev.profitcoin.network.model.listallcryptocurrency.Datum;

public interface CoinDetailView extends MvpView {

    @StateStrategyType(OneExecutionStateStrategy.class)
    void getFavoriteDataFromDb(Bundle bundle);

    void showAddFavoriteSuccess();

    void showDeleteFavoriteSuccess();

    void showErrorAddFavorite();

    void showChartsDetail(Datum datum);

    void onBackPressed();
}