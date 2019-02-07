package metube.services;

import metube.domain.models.service.TubeServiceModel;

import java.util.List;

public interface TubeService {

    void saveTube(TubeServiceModel tubeServiceModel);

    TubeServiceModel findTybeByName(String name);

    List<TubeServiceModel> findAllTubes();
}
