package com.ucm.informatica.spread.View;

import com.ucm.informatica.spread.Model.Poster;

public interface MainTabView {

    void initView();

    void loadDataAlertSmartContract(String title, String description, String latitude, String longitude, String dataTime);

    void loadDataPosterIPFS(Poster poster);

    int getDataPosterIPFSCount();

    void showErrorTransaction();

    void showConfirmationTransaction();

    void showLoading();

    void hideLoading();

    void initNotificationService();

    void createNotificationChannel();

    String getFilenameWalletLocally();

    String getWalletFilePath();

    String getPasswordLocally();
}
