import http from 'k6/http';
import { sleep } from 'k6';

export const options = {
  vus: 75,
  duration: '30s',
  ext: {
    loadimpact: {
      // Project: test
      projectID: 3672188,
      // Test runs with the same name groups test runs together.
      name: 'Test (03/12/2023-13:26:06)'
    }
  }
};

export default function() {
    http.get('http://localhost:8181/api/v1/users');
  sleep(1);
}