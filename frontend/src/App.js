import './App.css';
import {Provider} from 'react-redux';
import store from './redux/store';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import Main from './pages/main';
import Board from './pages/board';
import CreateApprove from './pages/createApprove';
import CreateGroup from './pages/createGroup';
import GroupDetail from './pages/groupDetail';
import Intro from './pages/intro';
import Login from './pages/login';
import MyPage from './pages/myPage';
import Ready from './pages/ready';
import NotFound from './pages/notFound';

function App() {
  return (
    <Provider store={store}>
      <BrowserRouter>
				{/* <Header /> */}
				<Routes>
					<Route path="/" element={<Main />}></Route>
          <Route path="/login" element={<Login />}></Route>
          <Route path="/board" element={<Board />}></Route>
          <Route path="/intro" element={<Intro />}></Route>
          <Route path="/myPage" element={<MyPage />}></Route>
          <Route path="/ready" element={<Ready />}></Route>
          <Route path="/groupDetail" element={<GroupDetail />}></Route>
          <Route path="/createApprove" element={<CreateApprove />}></Route>
          <Route path="/createGroup" element={<CreateGroup />}></Route>
					{/* 상단에 위치하는 라우트들의 규칙을 모두 확인, 일치하는 라우트가 없는경우 처리 */}
					<Route path="*" element={<NotFound />}></Route>
				</Routes>
			</BrowserRouter>
    </Provider>
  );
}

export default App;
