package GoogleExample.provider;

import com.google.inject.Provider;

public class DatabaseLogProvider implements Provider<Log> {

	@Override
	public Log get() {
		// TODO Auto-generated method stub
		return new Log("Databaselog");
	}

}
