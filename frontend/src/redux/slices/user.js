import {createSlice} from '@reduxjs/toolkit';

const initialState = {
    id: '',
    nickname: '',
    image:'',
};

const userSlice = createSlice({
  name: 'user',
  initialState,
  reducers: {
    setUser(state, action) {
      state.id = action.payload.id;
      state.nickname = action.payload.nickname;
      state.image = action.payload.phoneNumber;
    },
  },
  extraReducers: builder => {},
});

export default userSlice;