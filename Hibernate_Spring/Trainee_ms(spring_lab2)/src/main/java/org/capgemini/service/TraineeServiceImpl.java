package org.capgemini.service;

import java.util.List;

import org.cap.dao.ITraineeDao;
import org.cap.entities.Trainee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TraineeServiceImpl implements ITraineeService{
    private ITraineeDao traineeDao;

    public ITraineeDao getEmployeeDao(){
        return traineeDao;
    }

    @Autowired
    public void setTraineeDao(ITraineeDao dao){
        this.traineeDao=dao;
    }

	@Override
	public void addTrainee(Trainee t) {
		traineeDao.addTrainee(t);
		
	}

	@Override
	public void deleteTrainee(int id) {
		traineeDao.deleteTrainee(id);
		
	}

	@Override
	public Trainee modifyTrainee(Trainee t) {
		Trainee trainee = traineeDao.modifyTrainee(t);
		return trainee;
	}

	@Override
	public Trainee fetchTrainee(int id) {
		Trainee t = traineeDao.fetchTrainee(id);
		return t;
	}

	@Override
	public boolean credentialsCorrect(int id, String password) {
		boolean credentials = traineeDao.credentialsCorrect(id, password);
		return credentials;
	}

    
}
