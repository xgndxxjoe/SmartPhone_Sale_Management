USE [QLBanDienThoai]
GO
/****** Object:  Table [dbo].[CHINHANH]    Script Date: 8/8/2022 9:29:05 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CHINHANH](
	[MaCN] [int] NOT NULL,
	[TenCN] [varchar](15) NOT NULL,
	[DiaChi] [varchar](45) NOT NULL,
	[SDT] [int] NOT NULL,
	[rowguid] [uniqueidentifier] ROWGUIDCOL  NOT NULL,
 CONSTRAINT [PK_CHINHANH] PRIMARY KEY CLUSTERED 
(
	[MaCN] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[CHITIETHOADON]    Script Date: 8/8/2022 9:29:05 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CHITIETHOADON](
	[MaCTHD] [int] NOT NULL,
	[MaHD] [int] NOT NULL,
	[MaDT] [int] NOT NULL,
	[SoLuong] [int] NOT NULL,
	[rowguid] [uniqueidentifier] ROWGUIDCOL  NOT NULL,
 CONSTRAINT [PK_CHITIETHOADON] PRIMARY KEY CLUSTERED 
(
	[MaCTHD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DIENTHOAI]    Script Date: 8/8/2022 9:29:05 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DIENTHOAI](
	[MaDT] [int] NOT NULL,
	[TenDT] [varchar](15) NOT NULL,
	[HeDieuHanh] [varchar](15) NOT NULL,
	[RAM] [varchar](10) NOT NULL,
	[BoNho] [varchar](10) NOT NULL,
	[Gia] [float] NOT NULL,
	[SoLuongKho] [int] NOT NULL,
	[rowguid] [uniqueidentifier] ROWGUIDCOL  NOT NULL,
 CONSTRAINT [PK_DIENTHOAI] PRIMARY KEY CLUSTERED 
(
	[MaDT] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HOADON]    Script Date: 8/8/2022 9:29:05 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HOADON](
	[MaHD] [int] NOT NULL,
	[MaKho] [int] NOT NULL,
	[MaNV] [int] NOT NULL,
	[MaKH] [int] NOT NULL,
	[Ngay] [date] NOT NULL,
	[TongTien] [float] NOT NULL,
	[GhiChu] [varchar](50) NOT NULL,
	[rowguid] [uniqueidentifier] ROWGUIDCOL  NOT NULL,
 CONSTRAINT [PK_HOADON] PRIMARY KEY CLUSTERED 
(
	[MaHD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KHACHHANG]    Script Date: 8/8/2022 9:29:05 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KHACHHANG](
	[MaKH] [int] NOT NULL,
	[TenKH] [varchar](10) NOT NULL,
	[DiaChi] [varchar](50) NOT NULL,
	[SDT] [int] NOT NULL,
	[rowguid] [uniqueidentifier] ROWGUIDCOL  NOT NULL,
 CONSTRAINT [PK_KHACHHANG] PRIMARY KEY CLUSTERED 
(
	[MaKH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KHO]    Script Date: 8/8/2022 9:29:05 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KHO](
	[MaKho] [int] NOT NULL,
	[TenKho] [varchar](15) NOT NULL,
	[DiaChi] [varchar](50) NOT NULL,
	[MaCN] [int] NOT NULL,
	[rowguid] [uniqueidentifier] ROWGUIDCOL  NOT NULL,
 CONSTRAINT [PK_KHO] PRIMARY KEY CLUSTERED 
(
	[MaKho] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NHANVIEN]    Script Date: 8/8/2022 9:29:05 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NHANVIEN](
	[MaNV] [int] NOT NULL,
	[HoNV] [varchar](10) NOT NULL,
	[TenNV] [varchar](10) NOT NULL,
	[SDT] [int] NOT NULL,
	[NgaySinh] [date] NOT NULL,
	[GioiTinh] [char](3) NOT NULL,
	[DiaChi] [varchar](50) NOT NULL,
	[Luong] [float] NOT NULL,
	[Username] [varchar](50) NOT NULL,
	[Password] [varchar](50) NOT NULL,
	[MaCN] [int] NOT NULL,
	[rowguid] [uniqueidentifier] ROWGUIDCOL  NOT NULL,
 CONSTRAINT [PK_NHANVIEN2] PRIMARY KEY CLUSTERED 
(
	[MaNV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[CHINHANH] ([MaCN], [TenCN], [DiaChi], [SDT], [rowguid]) VALUES (1, N'NamDinh', N'Nam Dinh', 98888888, N'3a66943c-250c-ed11-817a-28f10e18b7a8')
INSERT [dbo].[CHINHANH] ([MaCN], [TenCN], [DiaChi], [SDT], [rowguid]) VALUES (2, N'HaiPhong', N'Hai Phong', 96666666, N'3b66943c-250c-ed11-817a-28f10e18b7a8')
INSERT [dbo].[CHINHANH] ([MaCN], [TenCN], [DiaChi], [SDT], [rowguid]) VALUES (3, N'VinhPhuc', N'Vinh Phuc', 99999999, N'3c66943c-250c-ed11-817a-28f10e18b7a8')
INSERT [dbo].[CHINHANH] ([MaCN], [TenCN], [DiaChi], [SDT], [rowguid]) VALUES (4, N'DaNang', N'Da Nang', 62626262, N'3d66943c-250c-ed11-817a-28f10e18b7a8')
INSERT [dbo].[CHINHANH] ([MaCN], [TenCN], [DiaChi], [SDT], [rowguid]) VALUES (5, N'HCM', N'TP HCM', 68686868, N'3e66943c-250c-ed11-817a-28f10e18b7a8')
INSERT [dbo].[CHINHANH] ([MaCN], [TenCN], [DiaChi], [SDT], [rowguid]) VALUES (6, N'Thai Binh', N' Thai Binh', 62626262, N'9c359f2e-8012-ed11-817c-28f10e18b7a8')
GO
INSERT [dbo].[CHITIETHOADON] ([MaCTHD], [MaHD], [MaDT], [SoLuong], [rowguid]) VALUES (1, 1, 1, 10, N'5466943c-250c-ed11-817a-28f10e18b7a8')
INSERT [dbo].[CHITIETHOADON] ([MaCTHD], [MaHD], [MaDT], [SoLuong], [rowguid]) VALUES (2, 2, 3, 10, N'5566943c-250c-ed11-817a-28f10e18b7a8')
INSERT [dbo].[CHITIETHOADON] ([MaCTHD], [MaHD], [MaDT], [SoLuong], [rowguid]) VALUES (3, 3, 1, 10, N'5666943c-250c-ed11-817a-28f10e18b7a8')
INSERT [dbo].[CHITIETHOADON] ([MaCTHD], [MaHD], [MaDT], [SoLuong], [rowguid]) VALUES (4, 3, 3, 10, N'5766943c-250c-ed11-817a-28f10e18b7a8')
INSERT [dbo].[CHITIETHOADON] ([MaCTHD], [MaHD], [MaDT], [SoLuong], [rowguid]) VALUES (5, 6, 1, 1, N'49a0f175-dd0c-ed11-9478-701ce721acf9')
INSERT [dbo].[CHITIETHOADON] ([MaCTHD], [MaHD], [MaDT], [SoLuong], [rowguid]) VALUES (6, 6, 2, 2, N'3a0a2d80-dd0c-ed11-9478-701ce721acf9')
INSERT [dbo].[CHITIETHOADON] ([MaCTHD], [MaHD], [MaDT], [SoLuong], [rowguid]) VALUES (7, 1, 2, 10, N'e7c6d414-6d12-ed11-817c-28f10e18b7a8')
INSERT [dbo].[CHITIETHOADON] ([MaCTHD], [MaHD], [MaDT], [SoLuong], [rowguid]) VALUES (8, 1, 3, 10, N'603fa945-6f12-ed11-817c-28f10e18b7a8')
INSERT [dbo].[CHITIETHOADON] ([MaCTHD], [MaHD], [MaDT], [SoLuong], [rowguid]) VALUES (9, 2, 3, 4, N'613ac822-0e14-ed11-9a11-a26373b9b542')
INSERT [dbo].[CHITIETHOADON] ([MaCTHD], [MaHD], [MaDT], [SoLuong], [rowguid]) VALUES (10, 2, 3, 4, N'4d6be639-0e14-ed11-9a11-a26373b9b542')
INSERT [dbo].[CHITIETHOADON] ([MaCTHD], [MaHD], [MaDT], [SoLuong], [rowguid]) VALUES (11, 1, 5, 5, N'7c8c1965-1814-ed11-817c-28f10e18b7a8')
INSERT [dbo].[CHITIETHOADON] ([MaCTHD], [MaHD], [MaDT], [SoLuong], [rowguid]) VALUES (12, 1, 5, 1, N'46104679-1814-ed11-817c-28f10e18b7a8')
INSERT [dbo].[CHITIETHOADON] ([MaCTHD], [MaHD], [MaDT], [SoLuong], [rowguid]) VALUES (13, 1, 5, 3, N'f2e9497a-6014-ed11-817c-28f10e18b7a8')
INSERT [dbo].[CHITIETHOADON] ([MaCTHD], [MaHD], [MaDT], [SoLuong], [rowguid]) VALUES (14, 1, 5, 1, N'cfe307c5-6014-ed11-817c-28f10e18b7a8')
INSERT [dbo].[CHITIETHOADON] ([MaCTHD], [MaHD], [MaDT], [SoLuong], [rowguid]) VALUES (15, 7, 1, 5, N'da54c4ff-9414-ed11-9480-701ce721acf9')
GO
INSERT [dbo].[DIENTHOAI] ([MaDT], [TenDT], [HeDieuHanh], [RAM], [BoNho], [Gia], [SoLuongKho], [rowguid]) VALUES (1, N'SamSung X1', N'Androi', N'4GB', N'64GB', 3600, 11, N'3f66943c-250c-ed11-817a-28f10e18b7a8')
INSERT [dbo].[DIENTHOAI] ([MaDT], [TenDT], [HeDieuHanh], [RAM], [BoNho], [Gia], [SoLuongKho], [rowguid]) VALUES (2, N'SamSung Z9', N'Androi', N'6GB', N'64GB', 4600, 29, N'4066943c-250c-ed11-817a-28f10e18b7a8')
INSERT [dbo].[DIENTHOAI] ([MaDT], [TenDT], [HeDieuHanh], [RAM], [BoNho], [Gia], [SoLuongKho], [rowguid]) VALUES (3, N'IPhone 8', N'OS', N'8GB', N'128GB', 8200, 35, N'4166943c-250c-ed11-817a-28f10e18b7a8')
INSERT [dbo].[DIENTHOAI] ([MaDT], [TenDT], [HeDieuHanh], [RAM], [BoNho], [Gia], [SoLuongKho], [rowguid]) VALUES (5, N'IPhone X', N'OS', N'8GB', N'64GB', 12000, 42, N'4266943c-250c-ed11-817a-28f10e18b7a8')
INSERT [dbo].[DIENTHOAI] ([MaDT], [TenDT], [HeDieuHanh], [RAM], [BoNho], [Gia], [SoLuongKho], [rowguid]) VALUES (6, N'Xiaomi Note 7', N'Androi', N'8GB', N'64GB', 8600, 12, N'4366943c-250c-ed11-817a-28f10e18b7a8')
INSERT [dbo].[DIENTHOAI] ([MaDT], [TenDT], [HeDieuHanh], [RAM], [BoNho], [Gia], [SoLuongKho], [rowguid]) VALUES (7, N'iphone xs', N'ios', N'4GB', N'64GB', 3000, 4, N'750c1979-e00c-ed11-9a10-934ee13f7a20')
INSERT [dbo].[DIENTHOAI] ([MaDT], [TenDT], [HeDieuHanh], [RAM], [BoNho], [Gia], [SoLuongKho], [rowguid]) VALUES (8, N'honor 8x', N'android', N'4GB', N'64GB', 100, 2, N'6ad187fd-e10c-ed11-91d1-3cf8625ba215')
INSERT [dbo].[DIENTHOAI] ([MaDT], [TenDT], [HeDieuHanh], [RAM], [BoNho], [Gia], [SoLuongKho], [rowguid]) VALUES (9, N'Iphone 6', N'ios', N'4GB', N'64GB', 2500, 3, N'f4e8712f-fa0e-ed11-ac60-089e01d61298')
INSERT [dbo].[DIENTHOAI] ([MaDT], [TenDT], [HeDieuHanh], [RAM], [BoNho], [Gia], [SoLuongKho], [rowguid]) VALUES (10, N'Ab', N'Androi', N'3GB', N'64GB', 100, 2, N'2702ee9c-0514-ed11-9a11-a26373b9b542')
INSERT [dbo].[DIENTHOAI] ([MaDT], [TenDT], [HeDieuHanh], [RAM], [BoNho], [Gia], [SoLuongKho], [rowguid]) VALUES (11, N'PTUDPT', N'Androi', N'8GB', N'128GB', 88888, 30, N'b387e071-8d14-ed11-817c-28f10e18b7a8')
GO
INSERT [dbo].[HOADON] ([MaHD], [MaKho], [MaNV], [MaKH], [Ngay], [TongTien], [GhiChu], [rowguid]) VALUES (1, 1, 1, 1, CAST(N'2022-07-23' AS Date), 51600, N'Tien mat', N'5166943c-250c-ed11-817a-28f10e18b7a8')
INSERT [dbo].[HOADON] ([MaHD], [MaKho], [MaNV], [MaKH], [Ngay], [TongTien], [GhiChu], [rowguid]) VALUES (2, 1, 1, 2, CAST(N'2022-07-22' AS Date), 8600, N'Tien mat', N'5266943c-250c-ed11-817a-28f10e18b7a8')
INSERT [dbo].[HOADON] ([MaHD], [MaKho], [MaNV], [MaKH], [Ngay], [TongTien], [GhiChu], [rowguid]) VALUES (3, 1, 4, 3, CAST(N'2022-07-20' AS Date), 12000, N'Chuyen khoan', N'5366943c-250c-ed11-817a-28f10e18b7a8')
INSERT [dbo].[HOADON] ([MaHD], [MaKho], [MaNV], [MaKH], [Ngay], [TongTien], [GhiChu], [rowguid]) VALUES (4, 2, 5, 3, CAST(N'2022-07-26' AS Date), 10000, N'da chuyen khoan', N'9d00a9b5-d90c-ed11-9e25-ec63d7df6195')
INSERT [dbo].[HOADON] ([MaHD], [MaKho], [MaNV], [MaKH], [Ngay], [TongTien], [GhiChu], [rowguid]) VALUES (5, 2, 3, 2, CAST(N'2022-07-28' AS Date), 12000, N'tien mat', N'fd0e71cb-d90c-ed11-9e25-ec63d7df6195')
INSERT [dbo].[HOADON] ([MaHD], [MaKho], [MaNV], [MaKH], [Ngay], [TongTien], [GhiChu], [rowguid]) VALUES (6, 3, 8, 1, CAST(N'2022-01-01' AS Date), 1000, N'bung hoa don', N'1b93da4a-dd0c-ed11-9478-701ce721acf9')
INSERT [dbo].[HOADON] ([MaHD], [MaKho], [MaNV], [MaKH], [Ngay], [TongTien], [GhiChu], [rowguid]) VALUES (7, 3, 8, 1, CAST(N'2002-01-01' AS Date), 218000, N'binhtoa', N'726a13e4-9414-ed11-9480-701ce721acf9')
GO
INSERT [dbo].[KHACHHANG] ([MaKH], [TenKH], [DiaChi], [SDT], [rowguid]) VALUES (1, N'Joe', N'Ha Noi', 98989898, N'4466943c-250c-ed11-817a-28f10e18b7a8')
INSERT [dbo].[KHACHHANG] ([MaKH], [TenKH], [DiaChi], [SDT], [rowguid]) VALUES (2, N'Black', N'Thanh Xuan', 29929299, N'4566943c-250c-ed11-817a-28f10e18b7a8')
INSERT [dbo].[KHACHHANG] ([MaKH], [TenKH], [DiaChi], [SDT], [rowguid]) VALUES (3, N'White', N'Ho Guom', 12389846, N'4666943c-250c-ed11-817a-28f10e18b7a8')
INSERT [dbo].[KHACHHANG] ([MaKH], [TenKH], [DiaChi], [SDT], [rowguid]) VALUES (4, N'Adam', N'Ha Dong', 1234567, N'def2024d-db0c-ed11-9e25-ec63d7df6195')
INSERT [dbo].[KHACHHANG] ([MaKH], [TenKH], [DiaChi], [SDT], [rowguid]) VALUES (5, N'Duc', N'Nam Dinh', 1234567, N'084d7d40-e00c-ed11-9a10-934ee13f7a20')
INSERT [dbo].[KHACHHANG] ([MaKH], [TenKH], [DiaChi], [SDT], [rowguid]) VALUES (6, N'Kot', N'Lao', 1234567888, N'416ffaca-f90e-ed11-ac60-089e01d61298')
INSERT [dbo].[KHACHHANG] ([MaKH], [TenKH], [DiaChi], [SDT], [rowguid]) VALUES (7, N'Yen', N'Ha Noi', 456889, N'c00b7f39-0d0f-ed11-9e25-ec63d7df6195')
INSERT [dbo].[KHACHHANG] ([MaKH], [TenKH], [DiaChi], [SDT], [rowguid]) VALUES (8, N'May2', N'May 2', 122, N'18679c78-0e0f-ed11-9e25-ec63d7df6195')
INSERT [dbo].[KHACHHANG] ([MaKH], [TenKH], [DiaChi], [SDT], [rowguid]) VALUES (9, N'May4', N'May4', 1234567, N'0217f59e-0e0f-ed11-91d1-3cf8625ba215')
INSERT [dbo].[KHACHHANG] ([MaKH], [TenKH], [DiaChi], [SDT], [rowguid]) VALUES (11, N'May5', N'May5', 1223456789, N'30d5c5c8-0e0f-ed11-ac60-089e01d61298')
INSERT [dbo].[KHACHHANG] ([MaKH], [TenKH], [DiaChi], [SDT], [rowguid]) VALUES (12, N'May3', N'May3', 33333333, N'2dc9937b-0f0f-ed11-947a-701ce721acf9')
INSERT [dbo].[KHACHHANG] ([MaKH], [TenKH], [DiaChi], [SDT], [rowguid]) VALUES (20, N'May1', N'May1', 43434343, N'17090159-0e0f-ed11-9a10-934ee13f7a20')
GO
INSERT [dbo].[KHO] ([MaKho], [TenKho], [DiaChi], [MaCN], [rowguid]) VALUES (1, N'HaiHau', N'Nam Dinh', 1, N'4766943c-250c-ed11-817a-28f10e18b7a8')
INSERT [dbo].[KHO] ([MaKho], [TenKho], [DiaChi], [MaCN], [rowguid]) VALUES (2, N'DoSon', N'Do Son', 2, N'4866943c-250c-ed11-817a-28f10e18b7a8')
INSERT [dbo].[KHO] ([MaKho], [TenKho], [DiaChi], [MaCN], [rowguid]) VALUES (3, N'VinhPhuc', N'Vinh Phuc', 3, N'4966943c-250c-ed11-817a-28f10e18b7a8')
INSERT [dbo].[KHO] ([MaKho], [TenKho], [DiaChi], [MaCN], [rowguid]) VALUES (4, N'DaNang', N'Da Nang', 4, N'4a66943c-250c-ed11-817a-28f10e18b7a8')
INSERT [dbo].[KHO] ([MaKho], [TenKho], [DiaChi], [MaCN], [rowguid]) VALUES (5, N'HaDong', N'Quan 1', 5, N'4b66943c-250c-ed11-817a-28f10e18b7a8')
INSERT [dbo].[KHO] ([MaKho], [TenKho], [DiaChi], [MaCN], [rowguid]) VALUES (7, N'Dong Hung', N'Dong Hung Thai Binh', 6, N'ca74d6e8-7b14-ed11-817c-28f10e18b7a8')
INSERT [dbo].[KHO] ([MaKho], [TenKho], [DiaChi], [MaCN], [rowguid]) VALUES (8, N'Thai Binh', N'Thai Binh', 6, N'a051ff6f-7d14-ed11-817c-28f10e18b7a8')
GO
INSERT [dbo].[NHANVIEN] ([MaNV], [HoNV], [TenNV], [SDT], [NgaySinh], [GioiTinh], [DiaChi], [Luong], [Username], [Password], [MaCN], [rowguid]) VALUES (1, N'Pham', N'Duc', 349996001, CAST(N'1999-05-20' AS Date), N'Nam', N'Thai Binh', 26000, N'duc', N'123456', 1, N'4c66943c-250c-ed11-817a-28f10e18b7a8')
INSERT [dbo].[NHANVIEN] ([MaNV], [HoNV], [TenNV], [SDT], [NgaySinh], [GioiTinh], [DiaChi], [Luong], [Username], [Password], [MaCN], [rowguid]) VALUES (2, N'Nguyen', N'Trang', 262626266, CAST(N'1998-05-05' AS Date), N'Nu ', N'Thanh Hoa', 20000, N'trang', N'123456', 4, N'4d66943c-250c-ed11-817a-28f10e18b7a8')
INSERT [dbo].[NHANVIEN] ([MaNV], [HoNV], [TenNV], [SDT], [NgaySinh], [GioiTinh], [DiaChi], [Luong], [Username], [Password], [MaCN], [rowguid]) VALUES (3, N'Huynh', N'Duc', 62626262, CAST(N'1999-08-08' AS Date), N'Nam', N'Hai Phong', 18000, N'duc123', N'123456', 2, N'4e66943c-250c-ed11-817a-28f10e18b7a8')
INSERT [dbo].[NHANVIEN] ([MaNV], [HoNV], [TenNV], [SDT], [NgaySinh], [GioiTinh], [DiaChi], [Luong], [Username], [Password], [MaCN], [rowguid]) VALUES (4, N'Thai', N'Binh', 98989898, CAST(N'1998-09-10' AS Date), N'Nam', N'Hai Phong', 22000, N'binh', N'123456', 1, N'4f66943c-250c-ed11-817a-28f10e18b7a8')
INSERT [dbo].[NHANVIEN] ([MaNV], [HoNV], [TenNV], [SDT], [NgaySinh], [GioiTinh], [DiaChi], [Luong], [Username], [Password], [MaCN], [rowguid]) VALUES (5, N'Suong', N'Giang', 19829832, CAST(N'1999-10-12' AS Date), N'Nam', N'Nam Dinh', 18000, N'giang', N'123456', 2, N'5066943c-250c-ed11-817a-28f10e18b7a8')
INSERT [dbo].[NHANVIEN] ([MaNV], [HoNV], [TenNV], [SDT], [NgaySinh], [GioiTinh], [DiaChi], [Luong], [Username], [Password], [MaCN], [rowguid]) VALUES (6, N'Hong', N'Dang', 92356945, CAST(N'2000-12-12' AS Date), N'Nam', N'Bac Ninh', 19000, N'dang123', N'123456', 2, N'010e395e-da0c-ed11-9e25-ec63d7df6195')
INSERT [dbo].[NHANVIEN] ([MaNV], [HoNV], [TenNV], [SDT], [NgaySinh], [GioiTinh], [DiaChi], [Luong], [Username], [Password], [MaCN], [rowguid]) VALUES (7, N'Trinh', N'Dat', 12397888, CAST(N'2000-02-22' AS Date), N'Nam', N'Da Nang', 12000, N'dat', N'123456', 3, N'8d5efe6c-dc0c-ed11-817b-28f10e18b7a8')
INSERT [dbo].[NHANVIEN] ([MaNV], [HoNV], [TenNV], [SDT], [NgaySinh], [GioiTinh], [DiaChi], [Luong], [Username], [Password], [MaCN], [rowguid]) VALUES (8, N'Nguyen', N'Bung', 123523331, CAST(N'2000-02-22' AS Date), N'Nam', N'HN', 10000, N'bung', N'123456', 3, N'db252e2a-dd0c-ed11-9478-701ce721acf9')
INSERT [dbo].[NHANVIEN] ([MaNV], [HoNV], [TenNV], [SDT], [NgaySinh], [GioiTinh], [DiaChi], [Luong], [Username], [Password], [MaCN], [rowguid]) VALUES (10, N'Update', N'May 2', 123901093, CAST(N'1998-02-02' AS Date), N'Nam', N'HN', 6000, N'update', N'123456', 6, N'24d0d3e2-0d0f-ed11-817c-28f10e18b7a8')
GO
ALTER TABLE [dbo].[CHINHANH] ADD  CONSTRAINT [MSmerge_df_rowguid_799496AF4577428CB28B2D066A3F7EE8]  DEFAULT (newsequentialid()) FOR [rowguid]
GO
ALTER TABLE [dbo].[CHITIETHOADON] ADD  CONSTRAINT [MSmerge_df_rowguid_6E57CCE2A673403A82C6CCAA51BEA979]  DEFAULT (newsequentialid()) FOR [rowguid]
GO
ALTER TABLE [dbo].[DIENTHOAI] ADD  CONSTRAINT [MSmerge_df_rowguid_0C480D9CF07D42EDAFC03B8493D6560A]  DEFAULT (newsequentialid()) FOR [rowguid]
GO
ALTER TABLE [dbo].[HOADON] ADD  CONSTRAINT [MSmerge_df_rowguid_D7B92455499E4D7FB9F83373E5948D29]  DEFAULT (newsequentialid()) FOR [rowguid]
GO
ALTER TABLE [dbo].[KHACHHANG] ADD  CONSTRAINT [MSmerge_df_rowguid_340BC3F67C204C34921FAE5AE85432EC]  DEFAULT (newsequentialid()) FOR [rowguid]
GO
ALTER TABLE [dbo].[KHO] ADD  CONSTRAINT [MSmerge_df_rowguid_A1F79BE6672C42649E792668407ECDC7]  DEFAULT (newsequentialid()) FOR [rowguid]
GO
ALTER TABLE [dbo].[NHANVIEN] ADD  CONSTRAINT [MSmerge_df_rowguid_D751BD4B4A9244E595A7440B0D88BA59]  DEFAULT (newsequentialid()) FOR [rowguid]
GO
ALTER TABLE [dbo].[CHITIETHOADON]  WITH CHECK ADD  CONSTRAINT [FK_CHITIETHOADON_DIENTHOAI] FOREIGN KEY([MaDT])
REFERENCES [dbo].[DIENTHOAI] ([MaDT])
GO
ALTER TABLE [dbo].[CHITIETHOADON] CHECK CONSTRAINT [FK_CHITIETHOADON_DIENTHOAI]
GO
ALTER TABLE [dbo].[CHITIETHOADON]  WITH CHECK ADD  CONSTRAINT [FK_CHITIETHOADON_HOADON] FOREIGN KEY([MaHD])
REFERENCES [dbo].[HOADON] ([MaHD])
GO
ALTER TABLE [dbo].[CHITIETHOADON] CHECK CONSTRAINT [FK_CHITIETHOADON_HOADON]
GO
ALTER TABLE [dbo].[HOADON]  WITH CHECK ADD  CONSTRAINT [FK_HOADON_KHACHHANG] FOREIGN KEY([MaKH])
REFERENCES [dbo].[KHACHHANG] ([MaKH])
GO
ALTER TABLE [dbo].[HOADON] CHECK CONSTRAINT [FK_HOADON_KHACHHANG]
GO
ALTER TABLE [dbo].[HOADON]  WITH CHECK ADD  CONSTRAINT [FK_HOADON_KHO] FOREIGN KEY([MaKho])
REFERENCES [dbo].[KHO] ([MaKho])
GO
ALTER TABLE [dbo].[HOADON] CHECK CONSTRAINT [FK_HOADON_KHO]
GO
ALTER TABLE [dbo].[HOADON]  WITH CHECK ADD  CONSTRAINT [FK_HOADON_NHANVIEN] FOREIGN KEY([MaNV])
REFERENCES [dbo].[NHANVIEN] ([MaNV])
GO
ALTER TABLE [dbo].[HOADON] CHECK CONSTRAINT [FK_HOADON_NHANVIEN]
GO
ALTER TABLE [dbo].[KHO]  WITH CHECK ADD  CONSTRAINT [FK_CHINHANH_KHO] FOREIGN KEY([MaCN])
REFERENCES [dbo].[CHINHANH] ([MaCN])
GO
ALTER TABLE [dbo].[KHO] CHECK CONSTRAINT [FK_CHINHANH_KHO]
GO
ALTER TABLE [dbo].[NHANVIEN]  WITH CHECK ADD  CONSTRAINT [FK_NHANVIEN_CHINHANH] FOREIGN KEY([MaCN])
REFERENCES [dbo].[CHINHANH] ([MaCN])
GO
ALTER TABLE [dbo].[NHANVIEN] CHECK CONSTRAINT [FK_NHANVIEN_CHINHANH]
GO
/****** Object:  StoredProcedure [dbo].[KhachHangDaMuaSanPham]    Script Date: 8/8/2022 9:29:05 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[KhachHangDaMuaSanPham]
AS
BEGIN
	SELECT kh.TenKH as 'Ten khach hang', hd.TongTien as 'Tong tien' FROM KHACHHANG kh INNER JOIN HOADON hd
	ON kh.MaKH = hd.MaKH
END
GO
/****** Object:  StoredProcedure [dbo].[tinhTongTienChiTietHoaDon]    Script Date: 8/8/2022 9:29:05 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[tinhTongTienChiTietHoaDon]
(
@maCTHD int,
@maHD int,
@maDT int,
@soLuong int,
@tongTien float OUT
)
AS
BEGIN
	INSERT INTO CHITIETHOADON (MaCTHD, MaHD, MaDT, SoLuong)
	VALUES(@maCTHD, @maHD, @maDT, @soLuong);
	SET @tongTien = @soLuong * (SELECT GIA FROM DIENTHOAI WHERE MaDT = @maDT);
END
GO
/****** Object:  StoredProcedure [dbo].[toanbothongtinCTHD]    Script Date: 8/8/2022 9:29:05 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[toanbothongtinCTHD]
AS
BEGIN
	SELECT * FROM CHITIETHOADON
END
GO
