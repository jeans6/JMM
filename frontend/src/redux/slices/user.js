import {createSlice} from '@reduxjs/toolkit';

// store -> root reducer(state) -> user slice
// state.user.id

// action: state를 바꾸는 행위/동작
// dispatch: 그 액션을 실제로 실행하는 함수
// reducers: 액션이 실제로 실행되면 state를 바꾸는 로직
// selector: 리덕스에 저장되어있는 친구 불러올 때 사용

const initialState = {
  nickname: '',
  id: '',
  image: '',
};

const userSlice = createSlice({
  name: 'user',
  initialState,
  reducers: {
    setUser(state, action) {
      state.nickname = action.payload.nickname;
      state.id = action.payload.id;
      state.image = action.payload.image;
    },
  },
  extraReducers: builder => {},
});

export default userSlice;